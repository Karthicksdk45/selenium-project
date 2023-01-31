package JavaWorkings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Collections {

	public static void main(String[] args) 
	{
        Collection<String> listOne = Arrays.asList("milan","iga","dingo","elpha","hafil","meat","neeta.peeta");
        Collection<String> listTwo = Arrays.asList("hafil","iga","binga","mike","dingo","sdk");
        Collection<String> similar = new ArrayList<String>(listOne);
        Collection<String> different = new ArrayList<String>();
        different.addAll( listOne );
        different.addAll( listTwo );
        similar.retainAll( listTwo );
        different.removeAll( similar );

        System.out.printf("One:%s%nTwo:%s%nSimilar:%s%nDifferent:%s%n", listOne, listTwo, similar, different);
    }

}
