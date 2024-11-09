class StringDemo{
    public static void main(String[] args) {
        //initialization
        String str1 = "Nithesh";
        System.out.println(str1);   //This literal is taken from the literal pool

        //copy constructor
        String copy = new String(str1);
        System.out.println("The Copied String is : " + copy);
        
        //creating string from character array
        char [] House = {'J','A','N','A','N','I'};
        String Housename = new String(House);
        System.out.println("The house name is : "+Housename);

        byte [] petname = {65,67,68} ;
        String pet = new String(petname);
        System.out.println("The petname is : " + pet);

        String Concatenate = str1 + Housename;
        System.out.println("The conatenated String is : "+Concatenate);
        String Concat = str1.concat(Housename);
        System.out.println("The concatenation using concat : " + Concat);

        //Substring
        String substring = new String(Concatenate.substring(7,13));
        System.out.println("The Substring is : "+substring);

        //String length() -- is a method but length of arrays is property 
        System.out.println("The Number of letters in my name is : "+str1.length());

        //Changing cases to Upper and lower
        System.out.println("The Uppercase of my name: "+str1.toUpperCase());
        System.out.println("The Lower case of My house: "+ Housename.toLowerCase());

        //To trim the whitespaces trailing
        String whites = "   Halwa  Papad ";
        System.out.println("The trimed whites is :"+ whites.trim());

        //Replace
        // replace(old char, new char) - replaces character
        // replaceAll(reger , replacement) - replaces patter with replacer
        System.out.println("The w replaced in whites : "+whites.replace('H','J'));
        System.out.println("the Halwa in whites:"+whites.replaceAll("Halwa","Jalebi"));
    }
}
