package com.dashboard.dashboard.card;

import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(path = "/card")
public class CardController {

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public List<Card> getCards() {
        return cardService.getCards();
    }

    @PutMapping(path = "/add")
    public Card addCard(@NotNull @RequestBody Card card) {
        return cardService.addCard(card);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteCard(@NotNull @PathVariable("id") Long id) {
        cardService.deleteCard(id);
    }

    @PostMapping(path = "/update")
    public Card updateCard(@NotNull @RequestBody Card card) {
        return cardService.updateCard(card);
    }
}
