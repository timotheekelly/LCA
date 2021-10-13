import unittest
import lca

class TestNode(unittest.TestCase):

        def test_node4_5(self):
            self.assertEqual(lca.findLCA(lca.root, 4, 5), 2)

if __name__ == '__main__':
    unittest.main()