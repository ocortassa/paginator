package org.github.ocortassa.paginator;

public class SequenceGenerator {

    private final static int PAGES_PER_SHEET = 4;

    public String generateSequentialProgression(int pageNum) {
        StringBuilder sb = new StringBuilder("\n");
        int maxPage = roundToUpperFourMultiple(pageNum);
        for (int i=0; i < maxPage; i+=PAGES_PER_SHEET) {
            sb.append(i + 4).append(",");
            sb.append(i + 1).append(",");
            sb.append(i + 2).append(",");
            sb.append(i + 3).append(",");
            if (i > 0 && i % 5 == 0) {
                sb.deleteCharAt(sb.length() - 1).append("\n");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public String generateFoldedProgression(int pageNum) {
        StringBuilder sb = new StringBuilder("\n");
        int maxPage = roundToUpperFourMultiple(pageNum);
        int blocks = maxPage / PAGES_PER_SHEET;
        int start = 1;
        int stop = maxPage;
        for (int i=0; i < blocks; i++) {
            sb.append(stop).append(",");
            sb.append(start).append(",");
            sb.append(start + 1).append(",");
            sb.append(stop - 1).append(",");
            stop -= 2;
            start += 2;
            if (i > 0 && i % 5 == 0) {
                sb.deleteCharAt(sb.length() - 1).append("\n");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private int roundToUpperFourMultiple(int pageNum) {
        if (pageNum <= 3) {
            return PAGES_PER_SHEET;
        }
        int roundedPageNum = pageNum;
        while (roundedPageNum % 4 != 0) {
            roundedPageNum++;
        }
        return roundedPageNum;
    }


}
