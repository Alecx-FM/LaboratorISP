package ro.ulbs.paradigme.lab8;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Laboratorul8 {

    public static void main(String[] args) {
        String filePath = "/Users/alexfechete/IdeaProjects/ISP Lab 1/src/ro/ulbs/paradigme/lab8/laborator8_input.xlsx";

        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            List<Integer> columnWidths = getColumnWidths(sheet);

            printSeparatorLine(columnWidths);

            System.out.print("| Row ");
            for (int i = 0; i < columnWidths.size(); i++) {
                System.out.printf("| Column %-" + (columnWidths.get(i) - 2) + "d ", i);
            }
            System.out.println("|");

            printSeparatorLine(columnWidths);

            for (Row row : sheet) {
                System.out.printf("| %-3d ", row.getRowNum());

                for (int i = 0; i < columnWidths.size(); i++) {
                    Cell cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                    String cellValue = getCellValueAsString(cell);
                    System.out.printf("| %-" + (columnWidths.get(i) - 2) + "s ", cellValue);
                }
                System.out.println("|");
            }

            printSeparatorLine(columnWidths);

        } catch (IOException e) {
            System.err.println("Error reading Excel file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static List<Integer> getColumnWidths(Sheet sheet) {
        List<Integer> columnWidths = new ArrayList<>();
        int maxColumns = 0;

        for (Row row : sheet) {
            maxColumns = Math.max(maxColumns, row.getLastCellNum());
        }

        for (int i = 0; i < maxColumns; i++) {
            columnWidths.add(Math.max(10, "Column X".length() + 2));
        }

        for (Row row : sheet) {
            for (int i = 0; i < maxColumns; i++) {
                Cell cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                String value = getCellValueAsString(cell);
                columnWidths.set(i, Math.max(columnWidths.get(i), value.length() + 2));
            }
        }

        return columnWidths;
    }

    private static String getCellValueAsString(Cell cell) {
        switch (cell.getCellType()) {
            case NUMERIC:
                return String.valueOf(cell.getNumericCellValue());
            case STRING:
                return cell.getStringCellValue();
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            case BLANK:
                return "";
            default:
                return "?";
        }
    }

    private static void printSeparatorLine(List<Integer> columnWidths) {
        System.out.print("+-----");
        for (Integer width : columnWidths) {
            System.out.print("+");
            for (int i = 0; i < width; i++) {
                System.out.print("-");
            }
        }
        System.out.println("+");
    }
}