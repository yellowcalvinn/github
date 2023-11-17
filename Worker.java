package sprawdzian;

import java.util.ArrayList;

public class Worker {

    public static void main(String[] args) {
        Tool tool = new Tool("mlot");
        tool.UseTool();
        java.util.List<Tool> narzedzia = new ArrayList<>();
        narzedzia.add(new Tool("Młotek"));
        narzedzia.add(new Tool("Srubokret"));
        narzedzia.add(new Tool("Łom"));
        narzedzia.add(new Tool("Nozyce"));
        narzedzia.add(new Tool("Kombinerki"));
        narzedzia.add(new Tool("Imbus"));
        narzedzia.add(new Tool("Obcęgi"));

        for (Tool t: narzedzia) {
            t.UseTool();
        }
    }
}