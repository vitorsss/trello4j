package org.trello4j;

import org.trello4j.model.Label;

public interface LabelService {
	Label createLabel(String idBoard, String name, String color);
}
