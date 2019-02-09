 

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
        int len = personArray.length;
        int i=0;
        
        System.out.println(len);
        
        // assume there is a `counter`
        // while `counter` is less than length of array
            // begin loop
            while(i<len){
                result = result + personArray[i].toString();
                i++;
                
            

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            }
            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
            for(int i=0;i<personArray.length;i++){
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
                result = result + personArray[i].toString();
            // end loop
            
        }

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
        for(Person ele: personArray) {
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
              result = result + ele.toString();
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
