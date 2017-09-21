/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deitel.blackjack;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;



import java.util.ArrayList;
import java.util.Random;
import javax.annotation.Resource;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

/**
 *
 * @author Dimitrios
 */
@WebService( name = "BlackJack", serviceName = "BlackjackService")
public class BlackJack 
{
    
    private @Resource WebServiceContext webServiceContext;
    private MessageContext messageContext;  
    private HttpSession session; 
    
    //deal card
    @WebMethod(operationName = "dealCard" )
    public String dealCard() 
    {
        String card = "";
        
        ArrayList< String > deck = 
                (ArrayList< String > ) session.getAttribute( "deck" );
        
        card = deck.get( 0 );
        deck.remove( 0 );
        
        return card;
    }
    
    
    
    //shuffle
    @WebMethod( operationName = "shuffle" )
    public void shuffle()
    {
        messageContext = webServiceContext.getMessageContext();
        session = ( ( HttpServletRequest ) messageContext.get(
            MessageContext.SERVLET_REQUEST ) ).getSession();
    
        ArrayList< String > deck = new ArrayList< String >();
        
        for( int face = 1; face <= 13; face++ )
            for( int suit =0; suit <= 3; suit++ )
                deck.add( face +" " + suit );
        
        String tempCard;
        Random randomObject = new Random();
        int index;
        
        for( int i = 0; i < deck.size() ; i++ )
        {
            index = randomObject.nextInt( deck.size() -1 );
            
            tempCard = deck.get( i );
            deck.set(i, deck.get( index ) );
            deck.set( index, tempCard );
        }
        
        session.setAttribute( "deck", deck );
    }
    
    
    @WebMethod( operationName = "getHandValue" )
    public int getHandValue( @WebParam( name = "hand" ) String hand )
    {
        String[] cards = hand.split("\t");
        int total= 0;
        int face;
        int aceCount = 0;
        
        for( int i = 0; i < cards.length; i++ )
        {
            face = Integer.parseInt(
                cards[ i ].substring( 0, cards[ i ].indexOf(" ") ) );
            
            switch( face )
            {
                case 1: 
                    ++aceCount;
                    break;
                case 11: //jack
                case 12://1ueen
                case 13://king
                    total += 10;
                    break;
                default: //add face
                    total += face;
                    break;
            }
        }
        
        if( aceCount > 0 )
        {
            if( total + 11 + aceCount - 1 <= 21 )
                total += 11 + aceCount - 1;
            else
                total += aceCount;
        }
        
       return total;
    }
}
