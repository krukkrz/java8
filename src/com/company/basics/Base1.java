package com.company.basics;

/*
* BUDOWANIE STRINGOW
*
* W momencie gdy uzywamy `result += "a"` to java uzywa StringBuildera (tworząc go na potrzebe operacji) i używa append.
* Jeżeli mamy do zbudowania string raz to spoko.
* Ale jeśli chcemy odpalić to w pętli to szybciej będzie najpierw stworzyć StringBuilder przed pętlą a potem jednorazowo używać append.
*
* W poniższym przykładzie czasy wykonania były:
* 1. dla 'result += "a"': 84 ms
* 2. dla StringBuilder przed forem: 3 ms
*
* WNIOSEK: jeśli musisz użyć budowania stringa wielokrotnie to zrób to na StringBuilderze, jeśli nie to sobie sklejaj
* */

public class Base1 {
    public String sol() {
        String result = "";
        StringBuilder stringBuilder = new StringBuilder(result);

        for (int i = 0; i < 10000; i++) {
//            result = result + "a";
//            result += "a";
            stringBuilder.append("a");
        }
        result = stringBuilder.toString();
        return result;
    }
}
