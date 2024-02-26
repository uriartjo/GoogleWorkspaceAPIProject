package org.example;

import com.google.api.services.docs.v1.Docs;

public class DocsAPI {
    private static Docs docService;

    public static Docs getDocService() {
        return docService;
    }

}
