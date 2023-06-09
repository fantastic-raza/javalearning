package oops;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

 class DisplayDate {
     public static void main(String[] args) {
         Date date = new Date();
         System.out.println(date.getTime());
         SimpleDateFormat dateFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
         System.out.println(dateFormat.format(date));

     }
 }