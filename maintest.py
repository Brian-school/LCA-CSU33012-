import unittest
import main


class LCAtest(unittest.TestCase):
    def test_NodeConstructor(self):
        root = main.Node(20)

    def test_BSTCreation(self):
        root = main.Node(20)
        root.left = main.Node(8)
        root.right = main.Node(22)
        root.left.left = main.Node(4)
        root.left.right = main.Node(12)
        root.left.right.left = main.Node(10)
        root.left.right.right = main.Node(14)

        self.assertEqual(root.data, 20, "checking if the root is correct")
        self.assertEqual(root.left.data, 8, "Checking if the roots left node is correct")
        self.assertEqual(root.right.data, 22, "Checking if the roots right node is correct")

    def test_lca(self):
        root = main.Node(20)
        root.left = main.Node(8)
        root.right = main.Node(22)
        root.left.left = main.Node(4)
        root.left.right = main.Node(12)
        root.left.right.left = main.Node(10)
        root.left.right.right = main.Node(14)

        n1 = 10;
        n2 = 14
        tmp = main.lca(root, n1, n2)
        self.assertEqual(tmp.data, 12, "Checking if the LCA of 10 and 14 is equal to 12")

        n1 = 14;
        n2 = 8
        tmp = main.lca(root, n1, n2)
        self.assertEqual(tmp.data, 8, "Checking if the LCA of 8 and 14 is equal to 8")

        n1 = 10;
        n2 = 22
        tmp = main.lca(root, n1, n2)
        self.assertEqual(tmp.data, 20, "Checking if the LCA of 10 and 22 is equal to 20")



if __name__ == '__main__':
    unittest.main()
