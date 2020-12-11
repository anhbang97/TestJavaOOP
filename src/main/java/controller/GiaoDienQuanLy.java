/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;

/**
 *
 * @author ANHBANG PC's
 * @param <ThemTT>
 */
public interface GiaoDienQuanLy<ThemTT> {
        void themThongTin(ThemTT themtt, Connection ketNoi);
}
