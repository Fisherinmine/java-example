/**
 * This class is generated by jOOQ
 */
package com.example.jooq;


import com.example.jooq.tables.Example;
import com.example.jooq.tables.User;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in test
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * 示例
     */
    public static final Example EXAMPLE = com.example.jooq.tables.Example.EXAMPLE;

    /**
     * The table <code>test.user</code>.
     */
    public static final User USER = com.example.jooq.tables.User.USER;
}
