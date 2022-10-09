package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
    private List<String> _list = new ArrayList<>();

    private void AddingElems2List() {
        for (int item = 0; item < 10; item++) {
            this._list.add(String.valueOf(item));
        }
    }

    public ListClass() {
        AddingElems2List();
    }
}