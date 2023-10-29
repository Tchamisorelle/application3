package inf331.application3.testdivison;

import inf331.application3.defclass.Division;


public class TestDivision {
    public static void main(String[] agrs){
        Division div = new Division();
        double testmethod1 = div.diviser(9, 3);
        System.out.println("le resultat de la methode 1 est " + testmethod1);

        double testmethod2 = Division.diviserStatique(30, 4);
        System.out.println("le resultat de la methode 2 est " + testmethod2);
    }
    
}


