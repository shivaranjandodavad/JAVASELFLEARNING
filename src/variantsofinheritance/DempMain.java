package variantsofinheritance;

public class DempMain {
    public static  void main(String args[]){
        //inheritance
        Reptiles reptiles=new Reptiles();
        System.out.println(reptiles.getAnimalType());//wild
        System.out.println(reptiles.getBloodType());//o+ve
        Reptiles reptiles2=new Reptiles(80,70,"domestic","AB",true,false,true);
        System.out.println(reptiles2.getAnimalType());//domestic
        System.out.println(reptiles2.getBloodType());//AB
//multilevel inheritance
        crocodile crocodile2=new crocodile();
        crocodile2.display();
    }
}
