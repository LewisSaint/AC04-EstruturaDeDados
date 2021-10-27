package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import position.Position;
import src.BTNode;
import src.LinkedBinaryTree;

import src.LinkedBinaryTree;

import javax.swing.*;


class LinkedBinaryTreeTest {

    @Test
    void Test() {

        LinkedBinaryTree<String> countryTree = new LinkedBinaryTree<String>();

        countryTree.addRoot("China");

        assertEquals("China", countryTree.root().element(), "China");

        //assertEquals("No parent", paisArvore.parent(paisArvore.root())); //passou, mas conta como erro no teste

        countryTree.insertLeft(countryTree.root(), "Japão");

        assertEquals("Japão", countryTree.left(countryTree.root()).element());

        countryTree.insertRight(countryTree.root(), "Coreia");

        assertEquals("Coreia", countryTree.right(countryTree.root()).element());

    }
}