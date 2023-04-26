package com.example.laba4;

import java.net.URL;
import java.util.*;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import static java.util.Collections.swap;

public class Viwer {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_clearMassiv;

    @FXML
    private Button btn_clearOutput;

    @FXML
    private Button btn_saveMassiv;

    @FXML
    private MenuItem btn_zad1;

    @FXML
    private MenuItem btn_zad10;

    @FXML
    private MenuItem btn_zad11;

    @FXML
    private MenuItem btn_zad12;

    @FXML
    private MenuItem btn_zad13;

    @FXML
    private MenuItem btn_zad14;

    @FXML
    private MenuItem btn_zad15;

    @FXML
    private MenuItem btn_zad16;

    @FXML
    private MenuItem btn_zad17;

    @FXML
    private MenuItem btn_zad18;

    @FXML
    private MenuItem btn_zad19;

    @FXML
    private MenuItem btn_zad2;

    @FXML
    private MenuItem btn_zad20;

    @FXML
    private MenuItem btn_zad20_1;

    @FXML
    private MenuItem btn_zad3;

    @FXML
    private MenuItem btn_zad4;

    @FXML
    private MenuItem btn_zad5;

    @FXML
    private MenuItem btn_zad6;

    @FXML
    private MenuItem btn_zad7;

    @FXML
    private MenuItem btn_zad8;

    @FXML
    private MenuItem btn_zad9;

    @FXML
    private TextField tf_input;

    @FXML
    private TextArea tf_output;

    @FXML
    void initialize() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        btn_saveMassiv.setOnAction(actionEvent -> {
            String list = tf_input.getText();
            linkedList.add(Integer.valueOf(list));
        });

        btn_clearMassiv.setOnAction(actionEvent -> {
            linkedList.clear();
        });

        btn_clearOutput.setOnAction(actionEvent -> {
            tf_output.clear();
        });

        //Вывод списка
        btn_zad1.setOnAction(actionEvent -> {
            tf_output.setText(String.valueOf(linkedList));
        });

        //Добавление в начала списка
        btn_zad2.setOnAction(actionEvent -> {
            String text = tf_input.getText();
            linkedList.addFirst(Integer.valueOf(text));
            tf_output.setText(String.valueOf(linkedList));
        });

        //Добавление элемента в конец списка:
        btn_zad3.setOnAction(actionEvent -> {
            String text = tf_input.getText();
            linkedList.addLast(Integer.valueOf(text));
            tf_output.setText(String.valueOf(linkedList));
        });

        //Показ всех элементов списка:
        btn_zad4.setOnAction(actionEvent -> {
            for (int i = 0; i < linkedList.size(); i++) {
                String outputText = linkedList.get(i) + " ";
                tf_output.appendText(outputText);
            }
        });

        //Удаление всех элементов списка
        btn_zad5.setOnAction(actionEvent -> {
            linkedList.clear();
        });

        //Определение количества элементов списка:
        btn_zad6.setOnAction(actionEvent -> {
            int size = linkedList.size();
            tf_output.setText("Эллементов списка " + size);
        });

        //Проверка списка на пустоту:
        btn_zad7.setOnAction(actionEvent -> {
            boolean isEmpty = linkedList.isEmpty();
            if (!isEmpty){
                tf_output.setText("Список не пуст");
            }
            else{
                tf_output.setText("Список пуст" );
            }
        });

        //Удаление первого элемента:
        btn_zad8.setOnAction(actionEvent -> {
            linkedList.removeFirst();
            tf_output.setText(String.valueOf(linkedList));
        });

        //Удаление последнего элемента:
        btn_zad9.setOnAction(actionEvent -> {
            linkedList.removeLast();
            tf_output.setText(String.valueOf(linkedList));
        });

        //Поиск данного значения в списке:
        btn_zad10.setOnAction(actionEvent -> {
            Integer ind = Integer.valueOf(tf_input.getText());
            int index = linkedList.indexOf(ind);
            if (index != -1) {
                tf_output.setText("Значение, найденное по индексу: " + index);
            } else {
                tf_output.setText("Значение не найдено в списке.");
            }
        });

        //Поиск наибольшего и наименьшего значений в списке:
        btn_zad11.setOnAction(actionEvent -> {
            int min = linkedList.getFirst();
            int max = linkedList.getFirst();
            for (int i = 1; i < linkedList.size(); i++) {
                if (linkedList.get(i) < min) {
                    min = linkedList.get(i);
                }
                if (linkedList.get(i) > max) {
                    max = linkedList.get(i);
                }
            }
            tf_output.setText("Минимальное значение в списке: " + min + "\n" + "Максимальное значение в списке: " + max);
        });

        //Удаление элемента списка с данным значением:
        btn_zad12.setOnAction(actionEvent -> {
            Integer index = Integer.valueOf(tf_input.getText());
            linkedList.remove(index);
            tf_output.setText(String.valueOf(linkedList));
        });

        //Удаление всех элементов списка с данным значением:
        btn_zad13.setOnAction(actionEvent -> {
            Integer index = Integer.valueOf(tf_input.getText());
            linkedList.removeAll(Collections.singleton(index));
            tf_output.setText(String.valueOf(linkedList));
        });

        //Изменение всех элементов списка с данным значением на новое:
        btn_zad14.setOnAction(actionEvent -> {
            Integer index = Integer.valueOf(tf_input.getText());
            Collections.replaceAll(linkedList, index, 7);
            tf_output.setText(String.valueOf(linkedList));
        });

        //Определение, является ли список симметричным:
        btn_zad15.setOnAction(actionEvent -> {
            boolean isSymmetric = true;
            for (int i = 0; i < linkedList.size() / 2; i++) {
                if (linkedList.get(i) != linkedList.get(linkedList.size() - i - 1)) {
                    isSymmetric = false;
                    break;
                }
            }
            if (isSymmetric) {
                tf_output.setText("Список является симметричным.");
            } else {
                tf_output.setText("Список не является симметричным.");
            }

        });

        //Определение, можно ли удалить из списка каких-нибудь два элемента так, чтобы новый список оказался упорядоченным:
        btn_zad16.setOnAction(actionEvent -> {
            boolean isOrderable = false;
            for (int i = 0; i < linkedList.size() - 1; i++) {
                LinkedList<Integer> tempList = new LinkedList<Integer>(linkedList);
                tempList.remove(i);
                tempList.remove(i);
                boolean isSorted = true;
                for (int j = 1; j < tempList.size(); j++) {
                    if (tempList.get(j) < tempList.get(j - 1)) {
                        isSorted = false;
                        break;
                    }
                }
                if (isSorted) {
                    isOrderable = true;
                    break;
                }
            }
            if (isOrderable) {
                tf_output.setText("Два элемента могут быть удалены, чтобы упорядочить список.");
            } else {
                tf_output.setText("Два элемента не могут быть удалены, чтобы упорядочить список.");
            }

        });

        //Определение, сколько различных значений содержится в списке:
        btn_zad17.setOnAction(actionEvent -> {
            Set<Integer> set = new HashSet<Integer>(linkedList);
            int count = set.size();
            tf_output.setText("Список содержит " + count + " различные значения.");

        });

        //Удаление из списка элементов, значения которых уже встречались в предыдущих элементах:
        btn_zad18.setOnAction(actionEvent -> {
            Set<Integer> set = new HashSet<Integer>();
            for (int i = 0; i < linkedList.size(); i++) {
                int value = linkedList.get(i);
                if (set.contains(value)) {
                    linkedList.remove(i);
                    i--;
                } else {
                    set.add(value);
                }
            }
            tf_output.setText(String.valueOf(linkedList));

        });

        //Изменение порядка элементов на обратный:
        btn_zad19.setOnAction(actionEvent -> {
            Collections.reverse(linkedList);
            tf_output.setText(String.valueOf(linkedList));
        });

        //Сортировка элементов списка двумя способами (изменение указателей, изменение значений элементов)
        //Простейшая сортировка (Bubble Sort)
        btn_zad20.setOnAction(actionEvent -> {
            boolean needIteration = true;
            while (needIteration) {
                needIteration = false;
                for (int i = 1; i < linkedList.size(); i++) {
                    if (linkedList.get(i) < linkedList.get(i - 1)) {
                        swap(linkedList, i, i-1);
                        needIteration = true;
                    }
                }
            }
            tf_output.setText(String.valueOf(linkedList));
        });

        //Сортировка вставками (Insertion Sort)
        btn_zad20_1.setOnAction(actionEvent -> {
            for (int left = 0; left < linkedList.size(); left++) {
                // Вытаскиваем значение элемента
                int value = linkedList.get(left);
                // Перемещаемся по элементам, которые перед вытащенным элементом
                int i = left - 1;
                for (; i >= 0; i--) {
                    // Если вытащили значение меньшее — передвигаем больший элемент дальше
                    if (value < linkedList.get(i)) {
                        linkedList.set(i + 1, linkedList.get(i));
                    } else {
                        // Если вытащенный элемент больше — останавливаемся
                        break;
                    }
                }
                // В освободившееся место вставляем вытащенное значение
                linkedList.set(i + 1, value);
            }
            tf_output.setText(String.valueOf(linkedList));
        });
    }

}
