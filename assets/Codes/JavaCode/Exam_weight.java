public class Exam_weight {
    // classname Exam_weight

    public static void main(String[] args) {
        // main fnc to run the code.

        int term1 = 412;
        // variable 'term1' storing 412 which are the marks of the student that he got in his 1st term Exam. 

        int term2 = 423;
        // variable 'term2' storing 423 which are the marks of the student that he got in his 2nd term Exam. 

        int term3 = 430;
        // variable 'term3' storing 430 which are the marks of the student that he got in his 3rd term Exam. 

        double wm = (0.3 * ( term1 + term2)) + (0.4 * term3);
        // finding the total marks scored by the student overall(Weighted marks). 

        // Weighted marks -> It is calculated by taking 30% marks of 1st term and 2nd term exams and 40% of 3rd term exam.

        // in the eqn, above 0.3 -> 30% of term1 and term2 exams
        //                   0.4 -> 40% of term3 exam.

        // Storing the final value of eqn in variable 'wm' of datatype double.

        // double dataype because it may contain decimal values.

        double wp = (wm / 5);
        // it is the average/percent of total weighted marks out of 500 marks.

        // (wm / 500) X 100 => wm / 5

        // storing the value of eqn in variable 'wp' of datatype double.

        // double dataype because it may contain decimal values.

        System.out.println("Weighted Marks: " + wm);
        // printing the total weighted marks got by the student.

        System.out.println("Weighted Percentage: " + wp + "%");
        // printing the Percentage of weighted marks out of 500 marks.

    }// main fnc closes here.

}// class ends here.
