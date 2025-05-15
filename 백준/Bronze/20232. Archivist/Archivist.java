import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        Map<Integer, String> winners = new HashMap<>();
        winners.put(1995, "ITMO");
        winners.put(1996, "SPbSU");
        winners.put(1997, "SPbSU");
        winners.put(1998, "ITMO");
        winners.put(1999, "ITMO");
        winners.put(2000, "SPbSU");
        winners.put(2001, "ITMO");
        winners.put(2002, "ITMO");
        winners.put(2003, "ITMO");
        winners.put(2004, "ITMO");
        winners.put(2005, "ITMO");
        winners.put(2006, "PetrSU, ITMO");
        winners.put(2007, "SPbSU");
        winners.put(2008, "SPbSU");
        winners.put(2009, "ITMO");
        winners.put(2010, "ITMO");
        winners.put(2011, "ITMO");
        winners.put(2012, "ITMO");
        winners.put(2013, "SPbSU");
        winners.put(2014, "ITMO");
        winners.put(2015, "ITMO");
        winners.put(2016, "ITMO");
        winners.put(2017, "ITMO");
        winners.put(2018, "SPbSU");
        winners.put(2019, "ITMO");

        System.out.println(winners.get(year));
    }
}