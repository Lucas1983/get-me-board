package com.gmb.web.application;

import com.gmb.business.service.BoardService;
import com.gmb.data.entity.cons.*;
import com.gmb.data.entity.eqt.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/board")
public class BoardController implements EquipmentControllerIfc{

    private BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/")
    @ResponseBody
    public String main() {
        return "Main BOARD page";
    }

    @GetMapping("/list")
    public String listBoards(ModelMap model) throws Exception {

        model.put("boards_list", boardService.findAll());
        return "board/list_boards";
    }

    @GetMapping("/add")
    public String addBoard(ModelMap model) throws Exception {

        model.put("board", new Board());
        model.put("brands", Brand.values());
        model.put("shapes", Shape.values());
        model.put("profiles", Profile.values());
        model.put("types", Type.values());
        model.put("cores", Core.values());
        model.put("bases", Base.values());
        model.put("flexes", Flex.values());
        model.put("levels", Level.values());
        return "board/add_board";
    }

    @PostMapping("/add")
    public String addBoard(@ModelAttribute Board board) throws Exception {

        boardService.save(board);
        return "redirect:list";
    }

    @GetMapping("/remove/{id}")
    public String removeBoardById(@PathVariable Long id) throws Exception {

        boardService.deleteById(id);
        return "redirect:../list";
    }
}
