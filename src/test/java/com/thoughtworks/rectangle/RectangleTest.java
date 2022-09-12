
package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void shouldReturnMinusOneAreaWhenLengthOrBreadthIsGiven() {
        Rectangle rectangle=new Rectangle(2,2);
       double area=rectangle.area();
       assertThat(area, is(closeTo(4,0.1)));
    }

   
    
}
