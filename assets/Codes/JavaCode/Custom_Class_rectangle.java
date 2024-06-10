class Rectangle{
    // custom created class(doesn't have main fnc) , classname Rectangle

    int length;
    // A variable 'length' just declared not initialized of datatype integer.

    // Integer Datatype because it doesn't contain any floating/decimal values.

    int breadth;
    // A variable 'breadth' just declared not intialized

    void setDimen(int a , int b){
        // A custom Fnc 'setDimen' taking two parameters 'a' and 'b' both of integer datatype.

        // returning nothing. (void).

        length = a;
        // storing the value of 'a' in variable 'length'.
        
        breadth = b;
        // storing the value of 'b' in variable 'breadth'.

    }// SetDimen() fnc ends here.

    public int perimeter(){
        // A custom fnc 'perimeter' taking no parameter, returning integer value.

        int perimeter = 2 * (length + breadth);
        // formula of perimeter of Rectangle:- 2 X (length + breadth).

        // storing the value of soln. in variable 'perimeter' of datatype integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.

        return perimeter;
        // returning the value stored in var 'perimeter' to Caller.

    }// perimeter() fnc ends here.

    public int area(){
        // A custom fnc 'area' taking no parameter, returning integer value.

        int area = length * breadth;
        // Area of Rectangle:- Length X breadth .

        // storing the value of answer in variable 'area' of datatype integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.

        return area;
        // returning the value of var 'area' to the caller.

    }// area() fnc ends here.

}// custom class ends.


// In next Program(pg 9.17), we use this class to get the area and perimeter of Rectangle.
