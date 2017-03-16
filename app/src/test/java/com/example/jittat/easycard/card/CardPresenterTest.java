package com.example.jittat.easycard.card;

import com.example.jittat.easycard.data.CardRepository;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by jittat on 16/3/2560.
 */

public class CardPresenterTest {
    @Mock
    CardRepository cardRepository;

    @Mock
    CardView cardView;

    private CardPresenter presenter;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        presenter = new CardPresenter(cardRepository, cardView);
    }

    @Test
    public void testStart() {
        when(cardRepository.getCardCount()).thenReturn(5);

        presenter.start();

        verify(cardRepository).getCardCount();
    }
}
