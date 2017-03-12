package com.jnit.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.DoubleSupplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//IntStream(int,short,byte and char),LongStream(long),DoubleStream(float and double)
//mapToInt,mapToDouble,mapToLong - stream pipeline methods we can use
public class PrimitiveStream {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3);
		System.out.println(stream.reduce((s, n) -> s + n));
		System.out.println(IntStream.of(1,2,3).sum());
		System.out.println(IntStream.of(1,2,3,4,5).average());
		System.out.println(DoubleStream.of(1.3,1.7,20.9).sum());
		
		DoubleSupplier supplier = () -> Math.random();
		DoubleStream random = DoubleStream.generate(supplier);
		random.limit(5).forEach(d -> System.out.println(d));
		
		//range and rangeClosed		
		IntStream.range('a', 'z').forEach(a -> System.out.println(a));
		System.out.println();
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		System.out.println();
		
		List<Integer> intList = Arrays.asList(1,2,4,5,6,7,8,3);
		int sum = intList.stream().filter(i -> i%2==0).mapToInt(i -> i).sum();
		System.out.println(sum);
		
		Item itemSamsungGalaxy6 = new Item();
        itemSamsungGalaxy6.setName("Samsung Galaxy 6");
        itemSamsungGalaxy6.setQuantity(20);
        itemSamsungGalaxy6.setPrice(200);
        
        Item itemNexus = new Item();
        itemNexus.setName("Nexus 5");
        itemNexus.setQuantity(12);
        itemNexus.setPrice(150);
        
        List<Item> listItems = new ArrayList<>();
        listItems.add(itemSamsungGalaxy6);
        listItems.add(itemNexus);
       
        int tq = listItems.stream().mapToInt(item -> item.getQuantity()).sum();
        System.out.println(tq);
        Double avgprice =listItems.stream().mapToDouble(item -> item.getPrice())
        		.average().getAsDouble();
        System.out.println(avgprice);
        //summary statistics
        IntSummaryStatistics stats = IntStream.of(1,2,3,4,5,7,8,9,6,14).summaryStatistics();
        System.out.println(stats);
	}

}

class Item {
    private String Name;
    private int Quantity;
    private double price;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    public void setPrice(double price) {
		this.price = price;
	}
    
    public double getPrice() {
		return price;
	}
}
