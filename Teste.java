import java.io.IOException;

public class Teste {
    public static void main(String[] args)throws IOException {
        System.out.println("Hello world!");
        char ch;
        ch = 'x';
        System.out.println("ch contains " + ch);
        ch++;
        System.out.println("ch is now " + ch);
        ch = 90;
        System.out.println("ch is now " + ch);
        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 922337203685477L;
        boolean tipoBooleano = true;
        System.out.println("Valor do tipoByte = " + tipoByte);
        System.out.println("Valor do tipoShort = " + tipoShort);
        System.out.println("Valor do tipoChar = " + tipoChar);
        System.out.println("Valor do tipoFloat = " + tipoFloat);
        System.out.println("Valor do tipoDouble = " + tipoDouble);
        System.out.println("Valor do tipoInt = " + tipoDouble);
        System.out.println("Valor do tipoLong = " + tipoLong);
        System.out.println("Valor do tipoBooleano = " + tipoBooleano);

        System.out.println("\nFirst line\nSecond line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF\n");

        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        if(b) System.out.println("This is executed.");
        b = false;
        if(b) System.out.println("This is not executed.");
        System.out.println("10 > 9 is " + (10 > 9));
        int count = 10;
        char chr = 'X';
        float f = 1.2F;
        int m;
        m = 10;
        if(m == 10){
            int n = 20;
            System.out.println("m and n> " + m +" " + n);
            m = n * 2;

        }
        // n = 100; // Erro! n não é conhecida aqui
        // m ainda é conhecida aqui
        System.out.println("m is " + m);
        //Demonstra o tempo de vida de uma variável
        for(int i = 0; i < 3; i++){
            int j = -1; //y será inicializada sempre que entrarmos no bloco
            System.out.println("j is: " + j); // essa linha sempre exibe -1
            j= 100;
            System.out.println("j is now: " + j);

        }

        //Demonstra os operadores relacionais e lógicos.
        int i, j; boolean b1,b2;
        i = 10;
        j = 11;
        if(i < j) System.out.println("\ni < j");
        if(i <= j) System.out.println("i <= j");
        if(i != j) System.out.println("i !=j");
        if(i == j) System.out.println("this wont execute");
        if(i >= j) System.out.println("this wont execute");


    }
}