package com.corejsf;

import java.io.Serializable;

enum CardType {
	NA, Visa, MasterCard, DinersClub, AmericanExpress, Discover
};

public class CreditCard implements Serializable {
	private String number;
	private CardType cardType;

	public CreditCard(String number) {
		setCardType(number.length());
		this.number = number;
	}

	public String toString() {
		return number;
	}

	public CardType getCardType() {
		return cardType;
	}

	private void setCardType(int length) {
		switch (length) {
		case 13:
			this.cardType = CardType.Visa;
		case 14:
			this.cardType = CardType.DinersClub;
		case 15:
			this.cardType = CardType.AmericanExpress;
		case 16:
			this.cardType = CardType.MasterCard;
		case 22:
			this.cardType = CardType.Discover;
		default:
			this.cardType = CardType.NA;
		}

	}
}