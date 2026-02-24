// Start of the program
public class Main {
    // These are all pretty self explanitory and similar to other languages.
    int integer = 5;
    String string = "Hello World";
    boolean bool = true;
    float floatingPoint = 3.14f;
    char character = 'A';

    public static void main(String[] args) {
        // Sets up the main and values in the ode
        Main m = new Main();
        // Print the initial Values
        System.out.println(m.integer);
        System.out.println(m.string);
        System.out.println(m.bool);
        System.out.println(m.floatingPoint);
        System.out.println(m.character);
        System.out.println("Hello World\n");

        // Sets up the class and calls the method in the class
        ChangingVariables myclass = new ChangingVariables();

        while (m.integer > 0) {
            System.out.println(m.integer);

            if (m.bool) {
                System.out.println("This is true");
            } else {
                System.out.println("This is false");
            }

            myclass.method(m.integer);

            if (m.integer%2 == 0) {
                myclass.printMethod();
            }

            m.integer--;
        }
    }
    
}

// Making this I realise how similar java is to C#. Essensially just a few different wording choices here and there.
class ChangingVariables {

    int x = 0;
    int classInteger = 5;
    String classString = "Hello World";
    boolean classBool = true;
    float classFloatingPoint = 3.14f;
    char classCharacter = 'A';

    // this is a function. it is called method in java.
    void method(int args) {
        x += 1;
        classInteger = args + classInteger;
        classString = "I changed " + x + " times";
        classBool = !classBool;
        classFloatingPoint = 6.28f;
        classCharacter = 'B';
    }

    void printMethod() {
        System.out.println("This is another method");
        System.out.println("x: " + x);
        System.out.println("classInteger: " + classInteger);
        System.out.println("classString: " + classString);
        System.out.println("classBool: " + classBool);
        System.out.println("classFloatingPoint: " + classFloatingPoint);
        System.out.println("classCharacter: " + classCharacter + "\n");
    }
}