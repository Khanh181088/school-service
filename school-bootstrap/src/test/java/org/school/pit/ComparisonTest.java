package org.school.pit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.school.Comparision;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class ComparisonTest {
    @Spy
    Comparision calculateForPIT;

    @Test
    public void isGreaterOrEqual0_should_return_true(){
        assertThat(calculateForPIT.isGreaterOrEqual0(1)).isEqualTo(true);
    }

    @Test
    public void isGreaterOrEqual0_should_return_false(){
        assertThat(calculateForPIT.isGreaterOrEqual0(-1)).isEqualTo(false);
    }
}