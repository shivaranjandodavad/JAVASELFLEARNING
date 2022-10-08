public class PrimeLogic {
boolean flag=true;

    public boolean isPrime(int num) {
       for(int i=2;i<num/2;i++){
           if(num%i==0){
             flag=false;
             break;
           }

       }

       return flag;

    }
}
