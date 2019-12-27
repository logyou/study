package algorithms.bplustee;

/**
 * 节点
 *
 * @author lyh
 * @date 2019/12/25 0025
 **/
public class Node<K, V> {
    /**
     * 父节点
     */
    private Node<K, V> parent;
    /**
     * 前节点
     */
    private Node<K, V> prev;
    /**
     * 后节点
     */
    private Node<K, V> next;
    /**
     * 条目
     */
    private Entry<K, V>[] entries;
}
