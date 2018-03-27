package br.com.joaomassan.codility.br.com.joaomassan.amazon.codility;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;

public class EarliestValidHour {

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");

    public String solution(int A, int B, int C, int D, int E, int F) {
        int[] inputs = new int[]{A, B, C, D, E, F};
        Arrays.sort(inputs);
        LocalTime lastParsedTime = permute(inputs, 0);
        return lastParsedTime == null ? "NOT POSSIBLE" : DATE_FORMAT.format(lastParsedTime);
    }

    private LocalTime permute(int[] array, int index) {
        LocalTime time = null;
        if (index >= array.length - 1) {
            return parse(array);
        }

        for (int i = index; i < array.length; i++) {
            int x = array[i];
            array[i] = array[index];
            array[index] = x;

            LocalTime timeAux = permute(array, index + 1);

            if (time == null) {
                time = timeAux;
            } else if (timeAux != null) {
                time = timeAux.isBefore(time) ? timeAux : time;
            }

            x = array[i];
            array[i] = array[index];
            array[index] = x;
        }

        return time;
    }

    private LocalTime parse(int[] inputs) {
        try {
            return LocalTime.parse(merge(inputs), DATE_FORMAT);
        } catch (DateTimeParseException ex) {
            // intentionally suppressed exception
        }
        return null;
    }

    private String merge(int[] inputs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputs.length; i++) {
            sb.append(inputs[i]);
            if ((i + 1) % 2 == 0 && i + 1 < inputs.length) {
                sb.append(":");
            }
        }
        return sb.toString();
    }
}