
package estructura.anidada;
import java.util.Scanner;
public class EstructuraAnidada {

public static void main(String[] args) {
Scanner ingrese=new Scanner(System.in);
System.out.println("ingrese primer numero");
int n1=ingrese.nextInt();
System.out.println("ingrse segundo numero");
int n2=ingrese.nextInt();
System.out.println("ingrese operacion");
char op=ingrese.next().charAt(0);

if(op=='+')
{
int r=n1+n2; 
System.out.print("la suma es");
System.out.print(r);
 }else if(op=='-'){
     int r=n1-n2; 
System.out.print("la resta es");
System.out.print(r);
       }
if(op=='*')
{
int r=n1*n2; 
System.out.print("la multiplicacion es");
System.out.print(r);
 }else if(op=='/'){
     int r=n1/n2; 
System.out.print("la division es");
System.out.print(r);
       }
 }
    }
    

