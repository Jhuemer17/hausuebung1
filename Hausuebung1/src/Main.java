/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Johannes Huemer
 */
public class Main {
    public static void main(String[]args)
    {
        EratosthenesPrimeSieve e = new EratosthenesPrimeSieve(100);
        e.printPrimes();
        e.isPrime(11);
    }
}
