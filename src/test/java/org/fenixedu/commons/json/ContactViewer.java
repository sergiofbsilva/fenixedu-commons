package org.fenixedu.commons.json;

import org.fenixedu.commons.json.JsonBuilder;
import org.fenixedu.commons.json.JsonViewer;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class ContactViewer implements JsonViewer<Contact> {

    @Override
    public JsonElement view(Contact obj, JsonBuilder context) {
        JsonObject json = new JsonObject();
        json.addProperty("value", obj.getValue());
        json.addProperty("type", obj.getType().name());
        return json;
    }
}