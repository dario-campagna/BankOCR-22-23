package dssc.assignment.bank;

import java.util.ArrayList;
import java.util.List;

public class Entry {

    List<Cell> cells = new ArrayList<>();

    public Entry(String firstLine, String secondLine, String thirdLine) {
        while (!firstLine.isEmpty()) {
            Cell cell = new Cell(firstLine.substring(0, 3) + secondLine.substring(0, 3) + thirdLine.substring(0, 3));
            cells.add(cell);
            firstLine = firstLine.substring(3);
            secondLine = secondLine.substring(3);
            thirdLine = thirdLine.substring(3);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        cells.forEach(cell -> stringBuilder.append(cell.toString()));
        String string= stringBuilder.toString();
        if(this.checksum()!=0){
            string=string+" ERR";
        }
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entry entry = (Entry) o;

        return cells.equals(entry.cells);
    }

    @Override
    public int hashCode() {
        return cells.hashCode();
    }


    public int checksum(){
        int sum=0;
        int cont=9;
        for(Cell cell : cells){
            sum=sum+Integer.parseInt(cell.toString())*cont;
            cont=cont-1;
        }
        return sum%11;
    }
}
