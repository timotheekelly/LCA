import unittest
import lca

class TestNode(unittest.TestCase):

        def test_node_4_5(self):
            self.assertEqual(lca.findLCA(lca.root, 4, 5), 2)
        
        def test_node_6_2(self):
            self.assertEqual(lca.findLCA(lca.root, 6, 2), 1)

        def test_node_none(self):
            self.assertEqual(lca.findLCA(None, 4, 5), -1) 

        def test_node_4_13(self):
            self.assertEqual(lca.findLCA(lca.root, 4, 13), -1) 

        def test_node_13_4(self):
            self.assertEqual(lca.findLCA(lca.root, 13, 4), -1) 

             