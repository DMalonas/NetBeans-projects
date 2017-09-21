package mytablemodeltest;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel
{
    private String[] fColumnNames;
    private ArrayList<String[]> fData;

    private Formatter databaseFormatter;
    private Scanner databaseScanner;

    public MyTableModel()
    {
        this.fColumnNames = new String[] {"First Name","Last Name","ID"};
        this.fData = new ArrayList<>();
    }

    public void saveToDatabase()
    {
        // open database file with a new formatter object
        try
        {
            databaseFormatter = new Formatter("database.txt");
        } // end try
        catch (SecurityException securityException)
        {
            System.err.println("You do not have write access to this file.");
            System.err.println(securityException.toString());
        } // end catch
        catch (FileNotFoundException filesNotFoundException)
        {
            System.err.println("Error creating file.");
            System.err.println(filesNotFoundException.toString());
        } // end catch

        // write from the datastructure into the database file
        Iterator itr = this.fData.iterator();
        while(itr.hasNext())
        {
            Object obj = itr.next();
            if (obj instanceof String[])
            {
                String[] row = (String[])obj;
                this.databaseFormatter.format("%s %s %s\r\n",
                        row[0], row[1], row[2]);
            }
            else
            {
                System.err.println("Error in writing to database");
            }
        } // end of while

        // close formatter
        this.databaseFormatter.close();
    } // end of method saveToDatabase

    public void loadFromDatabase()
    {
        if (!this.fData.isEmpty())
        {
            // clear the local datastructure and reload all from database
            this.fData.clear();
        }

        // open database file with a new scanner object
        try
        {
            databaseScanner = new Scanner(new File("database.txt"));
        } // end try
        catch (FileNotFoundException fileNotFoundException)
        {
            System.err.println("Error opening database file for reading: ");
            System.err.println(fileNotFoundException.toString());
        } // end catch

        // read from the database file into the datastructure
        try
        {
            while (databaseScanner.hasNext())
            {
                this.fData.add(new String[]
                {
                    this.databaseScanner.next(),
                    this.databaseScanner.next(),
                    this.databaseScanner.next()
                });
            } // end while
        } // end try
        catch (NullPointerException nullException)
        {
            System.err.println("Database scanner not opened correctly: ");
            System.err.println(nullException.toString());
        } catch (NoSuchElementException elementException)
        {
            System.err.println("File improperly formed.");
            System.err.println(elementException.toString());
        } // end catch
        catch (IllegalStateException stateException)
        {
            System.err.println("Error reading from file.");
            System.err.println(stateException.toString());
        } // end catch

        // close the scanner
        databaseScanner.close();

        // update the view
        fireTableDataChanged();

    } // end of method loadFromDatabase

    @Override
    public int getRowCount()
    {
        return fData.size();
    }

    @Override
    public int getColumnCount()
    {
        return fColumnNames.length;
    }

    @Override
    public Object getValueAt(int row, int col)
    {
        return fData.get(row)[col];
    }

    @Override
    public void setValueAt(Object o, int row, int col) {
        if(o instanceof String)
        {
            String[] aRow = this.fData.get(row);
            aRow[col] = (String)o;
            this.fData.set(row, aRow);
            fireTableCellUpdated(row, col);
        }
        else
        {
            System.err.println("Error while using method setValueAt");
        }
    }

    @Override
    public String getColumnName(int col)
    {
        return fColumnNames[col];
    }

} // end of class MyTableModel
