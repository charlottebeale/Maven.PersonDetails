package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int i = 0;
        while(i <  personArray.length) {
            // while `counter` is less than length of array
            // begin loop
            result = result + (personArray[i]);
            i++;

            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
        }   // append `stringRepresentation` to `result` variable

            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";

        // identify initial value
        //int i = 0;
        // identify terminal condition
        //Condition = (i < personArray.length);
        // identify increment
        //i++

        // use the above clauses to declare for-loop signature
            // begin loop
        for(int i = 0; i < personArray.length; i++) {
            Person currentPerson = personArray[i]; // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            String representation = currentPerson.toString();
            // append `stringRepresentation` to `result` variable
            result += representation;
            // end loop
        }
        return result;
    }



    public String forEachLoop() {
            String result = "";
            // identify array's type
            // identify array's variable-name

            // use the above discoveries to declare for-each-loop signature
            // begin loop
            for (Person thisPerson : personArray) {

                result += thisPerson.toString();
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            }
            // end loop

            return result;
        }


    public Person[] getPersonArray() {
        return personArray;
    }
}
