����   ? C
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V
     next ()Ljava/lang/String;  java/util/HashSet
  
      java/lang/String toCharArray ()[C
   ! " # $ java/lang/Character valueOf (C)Ljava/lang/Character;
  & ' ( add (Ljava/lang/Object;)Z
  * + ( contains	 
 - . / out Ljava/io/PrintStream;
 1 2 3 4 5 java/io/PrintStream print (C)V 7 findWord Code LineNumberTable main ([Ljava/lang/String;)V StackMapTable > [Ljava/lang/String; @ [C 
SourceFile findWord.java ! 6           8        *� �    9        	 : ;  8   �  	   �� Y� 	� L+� M+� N� Y� :-� :�66� 46� � %W����,� :�66� %46� � )� � ,� 0���ڱ    9   2          	  
 :  E 
 K  g  t  |  �  <   , � ,  =     ?  � �  ?"�   A    B