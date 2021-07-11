package twsjava.samples.apidemo.util;

import javax.swing.*;

public class TCombo<T> extends JComboBox<T> {
    @SafeVarargs
    public TCombo(T... items) {
        super(items);
    }

    public String getText() {
        return getSelectedItem() == null ? null : getSelectedItem().toString();
    }

    @SuppressWarnings("unchecked")
    @Override
    public T getSelectedItem() {
        return (T) super.getSelectedItem();
    }
}
