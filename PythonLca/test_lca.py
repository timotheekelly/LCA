import unittest
import lca

class TestNode(unittest.TestCase):

        def test_node4_5(self):
            self.assertEqual(lca.findLCA(lca.root, 4, 5), 2)
        
        def test_node6_2(self):
            self.assertEqual(lca.findLCA(lca.root, 6, 2), 1)

        def test_node_none(self):
            self.assertEqual(lca.findLCA(None, 4, 5), -1)      

if __name__ == '__main__':
    unittest.main()