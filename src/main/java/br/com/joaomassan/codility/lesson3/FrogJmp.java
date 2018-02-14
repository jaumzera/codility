package br.com.joaomassan.codility.lesson3;

public class FrogJmp {

    public int solution(int X, int Y, int D) {
        int iniPos = (Y - X);
        int jumps = iniPos / D;
        return iniPos % D > 0 ? ++jumps : jumps;
    }
}
