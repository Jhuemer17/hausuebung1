
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
        grenze = obergrenze;
        search();
        
    }
    private void search()
    {
        boolean finished = false;
        for(int i = 4; i<=grenze; i+=2)
        {
            if(!primes.contains(i))
            {
                System.out.print(i+" = ");
                for(int x = 0; x<primes.size(); x++)
                {
                    for(int y = x; y<primes.size();y++)
                    {
                        if(primes.get(x)+primes.get(y)==i)
                        {
                            System.out.print(primes.get(x)+" + "+primes.get(y));
                            System.out.println("");
                            finished = true;
                            break;
                        }
                    }
                    if(finished)
                    {
                        finished = false;
                        break;
                        
                    }
                }
            }
        }
    }
            
}
