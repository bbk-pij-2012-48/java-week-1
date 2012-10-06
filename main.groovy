// Test if numbers are prime

boolean prime;
println "1.) 2";
int count = 1;
int test = 3;

while (count<1000){
    prime = true;
    if(test%2==0)
                 prime = false;
    else{
         for (int i=3 ; i<Math.sqrt(test)+1 ; i+=2 ){
             if(test%i==0){
                           prime = false;
                           break;
             }
         }
    }
    
    if(prime){
            count++;
            println count + ".) " + test;
    }
    test+=2;
}
