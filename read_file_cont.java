import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;


public class Test {

public static void main(String args[]) throws InterruptedException, IOException {

BufferedReader br = new BufferedReader(new FileReader("D:\\check.txt"));

String line;

while (true) {

line = br.readLine();

if (line != null) {

System.out.println(line);

} else {

Thread.sleep(100);

}

}

}

}
