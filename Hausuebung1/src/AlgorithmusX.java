
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Johannes Huemer
 */
public class AlgorithmusX {
    EratosthenesPrimeSieve e;
    ArrayList<Integer>primes = new ArrayList();
    int grenze;

    public AlgorithmusX(int obergrenze) {
        e = new EratosthenesPrimeSieve(obergrenze);
        primes.addAll(e.primes);
        search();
        grenze = obergrenze;
    }
    private void search()
    {
        for(int i = 4; i<=grenze; i++)
        {
            if(!primes.contains(i))
            {
                for(int x = 0; primes.get(x)<i; x++)
                {
                    for(int y = 0; primes.get(y)<i;y++)
                    {
                        if(primes.get(x)+primes.get(y)==i)System.out.println(i+" = "+primes.get(x)+" + "+primes.get(y));
                    }
                }
            }
        }
    }
            
}
