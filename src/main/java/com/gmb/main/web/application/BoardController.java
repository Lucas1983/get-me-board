package com.gmb.main.web.application;

import com.gmb.main.business.service.BoardService;
import com.gmb.main.data.entity.Board;
import com.gmb.main.data.entity.cons.*;
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

        boardService.create(board);
        return "redirect:list";
    }

    @GetMapping("/edit/{id}")
    public String editBoard(@PathVariable Long id, ModelMap model) throws Exception {

        Board board = boardService.findOneById(id)
                                    .orElseThrow(() -> new RuntimeException("Invalid board id"));
        model.put("board", board);
        model.put("brands", Brand.values());
        model.put("shapes", Shape.values());
        model.put("profiles", Profile.values());
        model.put("types", Type.values());
        model.put("cores", Core.values());
        model.put("bases", Base.values());
        model.put("flexes", Flex.values());
        model.put("levels", Level.values());
        return "board/edit_board";
    }

    @PostMapping("/edit")
    public String editBoard(@ModelAttribute Board board) throws Exception {

        boardService.update(board);
        return "redirect:../list";
    }

    @GetMapping("/remove/{id}")
    public String removeBoardById(@PathVariable Long id) throws Exception {

        boardService.removeById(id);
        return "redirect:../list";
    }
}
