package org.ghostface.dev.main;

import org.ghostface.dev.entities.Prompt;
import org.ghostface.dev.entities.Script;
import org.ghostface.dev.impl.ListScript;
import org.ghostface.dev.root.Command;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import java.util.*;

public class Main {
    public static void main(String[] args)  {

        Prompt prompt = new Prompt("list");

        Script script = new ListScript();


}

final class Customer {
    private final @NotNull String id;
    private final @NotNull String name;
    private final @NotNull String surname;
    private final @NotNull String number;
    private final @NotNull String email;
    @Nullable
    TransactionAccount transactionAccount;

    public Customer(@NotNull String id, @NotNull String name, @NotNull String surname, @NotNull String number, @NotNull String email) {
        constructStringValidation(name, surname, id, number, email);

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.email = email;
        this.transactionAccount = null;
    }

    private void constructStringValidation(String name, String surname, String id, String number, String email) {
        if (name.isEmpty() || surname.isEmpty() || id.isEmpty() || number.isEmpty() || email.isEmpty()) {
            throw new RuntimeException("Customer parameters constructor must no be Empty");
        }
    }

    public TransactionAccount getAccount() {
        if (transactionAccount == null) {
            throw new NoSuchElementException("This Customer don't have account yet");
        }
        return transactionAccount;
    }

    public @NotNull String getName() {
        return name;
    }

    public @NotNull String getSurname() {
        return surname;
    }

    public @NotNull String getId() {
        return id;
    }

    public @NotNull String getNumber() {
        return number;
    }

    public @NotNull String getEmail() {
        return email;
    }
}
final class TransactionAccount {
    private final @NotNull String accountNumber;
    private final @NotNull Customer customer;
    private @Range(from = 0, to = Integer.MAX_VALUE) double balance;

    public TransactionAccount(@NotNull Customer customer, @NotNull String accountNumber) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = 0.0;
        customer.transactionAccount = this;
    }

    public @NotNull Customer getCustomer() {
        return customer;
    }

    @Range(from = 0, to = Integer.MAX_VALUE)
    public double getBalance() {
        return balance;
    }

    public @NotNull String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(@Range(from = 0, to = Integer.MAX_VALUE) double balance) {
        this.balance = balance;
    }
    }
}