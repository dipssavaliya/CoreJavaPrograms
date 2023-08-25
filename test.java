import java.util.*;
//first 10 even number
public class test {
	public static void main(String[] args)
	{
		
		List<Integer> num = new ArrayList<>();
		num.add(22);
		num.add(21);
		num.add(22);
		num.add(24);
		num.add(22);
		num.add(25);
		num.add(29);
		num.add(22);
		num.add(22);
		num.add(22);
		num.add(22);
		num.add(22);
		num.add(22);
		num.add(22);
		
		Integer  i1 = num.stream().filter(p->p%2==0).limit(10).reduce(0, Integer::sum);
		System.out.print(i1);
		//num.stream().filter(p->p%2==0).map(p->p.sum(p, p)).forEach(System.out::println);
		
		//num.stream().distinct().forEach(System.out::println);
		List<Integer> result = new ArrayList<Integer>();
		for(int i=0;i<num.size();i++) {
			for(int j=i+1;j<num.size();j++)
			{
				if(i+j ==45) {
				result.add(i);
				result.add(j);
			}
		}
	}
		System.out.print(result.toString());
	}
}
