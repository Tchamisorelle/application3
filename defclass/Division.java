package inf331.application3.defclass;

public class Division {
        public double diviser(double dividende, double diviseur) {
            if (diviseur == 0) {
                throw new ArithmeticException("Division par zéro n'est pas autorisée.");
            }
            return dividende / diviseur;
        }
    
        // Méthode de classe (statique) pour effectuer la division
        public static double diviserStatique(double dividende, double diviseur) {
            if (diviseur == 0) {
                throw new ArithmeticException("Division par zéro n'est pas autorisée.");
            }
            return dividende / diviseur;
        }
    
    
}
