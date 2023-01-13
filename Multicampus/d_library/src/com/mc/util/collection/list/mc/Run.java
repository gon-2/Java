package com.mc.util.collection.list.mc;

import com.mc.util.collection.dto.Music;
import com.mc.util.collection.set.mc.McHashSet;

public class Run {

   public static void main(String[] args) {
      
      McLinkedList<Music> list = new McLinkedList<>();
      McHashSet<Music> set = new McHashSet<>();
      
      Music music = new Music("백지영", "총 맞은 것 처럼");
      Music music2 = new Music("윤도현", "사랑했나봐");
      Music music3 = new Music("김경호", "금지된 사랑");
      
      list.add(music);
      list.add(music2);
      list.add(music3);
      
      set.add(music);
      set.add(music2);
      set.add(music3);
      
      System.out.println("=================== McLinkedList for-each Test ===================");
      
      for (Music m : list) {
         System.out.println(m);
      }
      
      System.out.println("==================== McHashSet for-each Test ====================");
      
//      for (Music m : set) {
//         System.out.println(m);
//      }
      
   }
}