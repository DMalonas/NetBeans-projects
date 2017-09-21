
package ServerProgramSerialised;

import clientprogramserialised.*;
import java.io.*;

public class GUIData implements Serializable {

   private String data1;
   private String data2;
   private static int dataCount;
   private int dataNum;

   public GUIData(String s) {
      this.data1 = s;
      GUIData.incCount();
      this.dataNum = GUIData.getCount();
   }

   public GUIData(GUIData dataObj) {  // copy constructor
      this.data1 = dataObj.getData1();
      this.data2 = dataObj.getData2();
      this.dataNum = dataObj.getNum();
   }

   public String getData1() {
      return this.data1;
   }

   public String getData2() {
      return this.data2;
   }

   public void setData2(String data2) {
      this.data2 = data2;
   }

   public static int incCount() {
      return GUIData.dataCount++;
   }

   public static int getCount() {
      return GUIData.dataCount;
   }

   public int getNum() {
      return this.dataNum;
   }
}  // end class GUIData